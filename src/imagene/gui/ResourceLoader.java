package imagene.gui;

import java.io.InputStream;

/*****************************************
 * Written by Avishkar Giri (s3346203)   *
 * for                                   *
 * Programming Project 1                 *
 * SP3 2016                              *
 ****************************************/

final class ResourceLoader {

    public static InputStream load(String path)
    {


        InputStream input= ResourceLoader.class.getResourceAsStream(path);
        //fileReader=new InputStreamReader(input);
        if(input==null)
        {
            input= ResourceLoader.class.getResourceAsStream("/"+path);
           // fileReader=new InputStreamReader(input);
        }
         return input;
    }
}
