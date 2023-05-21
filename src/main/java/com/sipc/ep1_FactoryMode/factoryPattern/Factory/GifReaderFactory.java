package com.sipc.ep1_FactoryMode.factoryPattern.Factory;

import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.GifRead;
import com.sipc.ep1_FactoryMode.factoryPattern.Pruduct.Reader;

public class GifReaderFactory implements ReaderFactory{
    @Override
    public Reader getReader() {
        return new GifRead();
    }
}
