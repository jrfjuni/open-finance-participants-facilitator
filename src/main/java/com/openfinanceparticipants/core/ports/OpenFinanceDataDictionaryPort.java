package com.openfinanceparticipants.core.ports;

import com.openfinanceparticipants.core.exceptions.OpenFinanceException;

/**
 * Class responsible for excuting tasks related to the OpenFinance Brasil API's data dictionaries.
 * @date Jan 30, 2023
 * @version 1
 *
 */
public interface OpenFinanceDataDictionaryPort {
    void findDataDictionaryConvertToExcelAndSave() throws OpenFinanceException;
}
