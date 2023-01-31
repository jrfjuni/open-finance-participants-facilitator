package com.openfinanceparticipants.core.service.excel;

import com.opencsv.CSVReader;
import com.openfinanceparticipants.core.domain.csv.Csv;
import com.openfinanceparticipants.core.domain.enums.EFileExtension;
import com.openfinanceparticipants.core.exceptions.excel.OpenFinanceExcelException;
import com.openfinanceparticipants.core.utils.OpenFinanceFileUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.FileReader;

@Slf4j
public class OpenFinanceExcelSupport {

    protected CSVReader getCSVReader(final Csv csvFile) throws OpenFinanceExcelException {
        try {
            final var file =
                    OpenFinanceFileUtils.createTempFileFromString(csvFile.getName(), EFileExtension.CSV, csvFile.getContent());

            return new CSVReader(new FileReader(file));
        }catch(final Exception ex){
            log.error("Error to get CSV File: {}", ex.getMessage());
            throw new OpenFinanceExcelException("Error to get CSV File.", ex);
        }
    }
}
