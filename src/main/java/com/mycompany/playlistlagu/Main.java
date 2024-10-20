/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.playlistlagu;

class Song {
    String title;
    Song next;

    public Song(String title) {
        this.title = title;
        this.next = null;
    }
}

class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    // Method untuk menambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newSong;
        }
    }

    // Method untuk menampilkan semua lagu dalam playlist
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist kosong.");
        } else {
            Song current = head;
            while (current != null) {
                System.out.println(current.title);
                current = current.next;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong("Song 1");
        myPlaylist.addSong("Song 2");
        myPlaylist.addSong("Song 3");

        myPlaylist.displayPlaylist();  // Menampilkan semua lagu
    }
}
