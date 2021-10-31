import 'package:flutter/material.dart';
import 'package:my_flutter_app/model/bookmark.dart';

import '../main.dart';

class BookmarksPage extends StatelessWidget {
  List<Bookmark> bookmarksList = [
    Bookmark("Flutter", "https://flutter.dev"),
    Bookmark("Google", "https://google.com"),
    Bookmark("Google", "https://google.com"),
    Bookmark("Google", "https://google.com"),
    Bookmark("Google", "https://google.com")
  ];

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("私のブックマークです"),
      ),
      body: BookmarksListWidget(bookmarksList),
    );
  }
}
