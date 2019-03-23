package com.crud.library.mapper;

import com.crud.library.domain.CopyInLibrary;
import com.crud.library.domain.CopyInLibraryDto;
import com.crud.library.objectNotFoundExceptions.CopyNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CopyInLibraryMapper {

    public CopyInLibraryDto mapToCopyInLibraryDto (CopyInLibrary copyInLibrary) throws CopyNotFoundException {
        return new CopyInLibraryDto(copyInLibrary.getCopyId(), copyInLibrary.getBook().getBookId(), copyInLibrary.getBook().getCopiesInLibrary().stream()
                .filter(b -> b.getCopyId() == copyInLibrary.getCopyId())
                .map(c -> c.getStatus())
                .findFirst()
                .orElseThrow(CopyNotFoundException::new));
    }
}
