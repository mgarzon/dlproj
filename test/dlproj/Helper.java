/*

 Copyright: All contributers to the Umple Project

 This file is made available subject to the open source license found at:
 http://umple.org/license

*/

package dlproj;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.*;
import org.eclipse.jgit.api.*;
import org.eclipse.jgit.api.errors.*;

import com.jcraft.jsch.*;

public final class Helper
{ 
  // Restrict instantiation 
  private Helper()
  {
  }

  // Clean up everything, everywhere  
  public static void cleanup()
  {
    try
    {
      Runtime.getRuntime().exec("rm -rf " + LOCAL_DOWNLOAD_DIRECTORY);
    }
    catch (IOException e)
    {
      Assert.fail("Unable to cleanup " + LOCAL_DOWNLOAD_DIRECTORY);
    }
  }

  public static final String LOCAL_DOWNLOAD_DIRECTORY = "./tmp";
  public static final String SAMPLE_PROJECT_NAME = "umple-ucsop/umple.sample.downloader";
  public static final String SAMPLE_PROJECT_BRANCH = "master";
  public static final String SAMPLE_PROJECT_LOCAL_README = "./tmp/umple-ucsop/umple.sample.downloader/master/README.md";
  public static final String SAMPLE_PROJECT_LOCAL_DIRECTORY = "./tmp/umple-ucsop/umple.sample.downloader/master";
  public static final String SAMPLE_PROJECT_GITHUB_URL = "https://github.com/umple-ucsop/umple.sample.downloader.git";
}


