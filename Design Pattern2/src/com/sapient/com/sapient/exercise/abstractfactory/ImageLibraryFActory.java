package com.sapient.com.sapient.exercise.abstractfactory;

/**
 * Created by sbha63 on 5/20/2017.
 */
public class ImageLibraryFActory implements ImageLibrary{


    @Override
    public ImageLibrary getImageLibraryType(String type) {
        if(type=="swt")
        {
            return new SwtImageLibrary();
        }
        else
        if (type=="awt")
        {
            return new AwtImageLibrary();
        }
        else
            if(type=="swing")
                return new SwingImageLibrary();

return null;
    }
}
