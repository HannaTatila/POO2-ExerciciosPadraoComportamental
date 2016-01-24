/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.AVI;
import util.FormatoVideo;
import util.MP3;
import util.MP4;

/**
 *
 * @author dell
 */
public class TestaReproducaoVideos {

    @Test
    public void executaArquivoMP3(){
        FormatoVideo mp3 = new MP3();
        mp3.executarVideo();
        Assert.assertSame(MP3.class, mp3.getClass());
    }

    @Test
    public void executaArquivoMP4(){
        FormatoVideo mp4 = new MP4();
        mp4.executarVideo();
        Assert.assertSame(MP4.class, mp4.getClass());
    }
    
    @Test
    public void executaArquivoAVI(){
        FormatoVideo avi = new AVI();
        avi.executarVideo();
        Assert.assertSame(AVI.class, avi.getClass());
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
