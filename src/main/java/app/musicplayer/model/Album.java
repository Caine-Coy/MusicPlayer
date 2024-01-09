/*
 * JavaFX Music Player. The MIT License (MIT).
 * Copyright (c) Almas Baim.
 * Copyright (c) Gerardo Prada, Michael Martin.
 * See LICENSE for details.
 */

package app.musicplayer.model;

import javafx.scene.image.Image;

import java.util.List;

/**
 * @author Almas Baim (https://github.com/AlmasB)
 */
public record Album (
        int id,
        String title,
        String artistName,
        Image artwork,
        List<Song> songs
) implements Comparable<Album> {

    @Override
    public int compareTo(Album other) {
        return title.compareTo(other.title);
    }
}