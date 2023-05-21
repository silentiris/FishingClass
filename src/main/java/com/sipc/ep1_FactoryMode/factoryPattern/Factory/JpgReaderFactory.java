package com.sipc.ep1_FactoryMode.factoryPattern.Factory;

import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.JpgReader;
import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.Reader;

public class JpgReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
