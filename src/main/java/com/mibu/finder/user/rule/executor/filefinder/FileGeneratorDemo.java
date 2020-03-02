package com.mibu.finder.user.rule.executor.filefinder;

import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.File;
import com.mibu.finder.user.rule.executor.filefinder.folder.structure.composite.Folder;

import java.util.Date;

public class FileGeneratorDemo {

  public static Folder generateTestDemoDirectory() {
    Folder root = new Folder("root");

    File song1 =
        new File("my first song.mp3", "mp3", "2 Mb", "root", new Date(), new Date(), new Date());
    File video1Mp4 =
        new File("Bautizo cat.mp4", "mp4", "200 Mb", "root", new Date(), new Date(), new Date());

    root.addNewItem(song1);
    root.addNewItem(video1Mp4);

    Folder opt = new Folder("opt");
    root.addNewItem(opt);

    File video2FormatAvi =
        new File(
            "carnaval  cat.mp4", "mp4", "3000MB", "/root/opt", new Date(), new Date(), new Date());
    opt.addNewItem(video2FormatAvi);

    return root;
  }
}
