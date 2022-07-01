package de.telran.operation;

import de.telran.IStringOperation;

import java.util.Locale;

public class UpperCaseOperation implements IStringOperation {
    @Override
    public String operate(String line) {
        return line.toUpperCase();
    }

    @Override
    public String getName() {
        return null;
    }
}
