package etl.domain;

import etl.extractor.CsvFormatException;

public interface Extractor {
    User[] extract() throws CsvFormatException;
}
