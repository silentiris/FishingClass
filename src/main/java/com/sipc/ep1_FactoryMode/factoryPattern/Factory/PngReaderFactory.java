package com.sipc.ep1_FactoryMode.factoryPattern.Factory;

import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.PngReader;
import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.Reader;

public class PngReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
