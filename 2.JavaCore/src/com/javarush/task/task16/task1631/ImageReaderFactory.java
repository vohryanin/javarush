package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

import static com.javarush.task.task16.task1631.common.ImageTypes.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader (ImageTypes imageType) {

            if (imageType != null) {
                if (imageType.name().equals("BMP")) return new BmpReader();
                else if (imageType.name().equals("JPG")) return new JpgReader();
                else if (imageType.name().equals("PNG")) return new PngReader();
                else throw new IllegalArgumentException("Неизвестный тип картинки");
            } else {
                throw new IllegalArgumentException("Неизвестный тип картинки");
            }
    }
}
