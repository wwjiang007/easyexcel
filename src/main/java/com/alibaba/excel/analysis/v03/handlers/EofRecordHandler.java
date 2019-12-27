package com.alibaba.excel.analysis.v03.handlers;

import org.apache.poi.hssf.record.Record;

import com.alibaba.excel.analysis.v03.IgnorableXlsRecordHandler;
import com.alibaba.excel.context.XlsReadContext;

/**
 * Record handler
 *
 * @author Dan Zheng
 */
public class EofRecordHandler implements IgnorableXlsRecordHandler {

    @Override
    public void processRecord(XlsReadContext xlsReadContext, Record record) {
        if (xlsReadContext.readSheetHolder() != null) {
            xlsReadContext.analysisEventProcessor().endSheet(xlsReadContext);
        }
    }
}