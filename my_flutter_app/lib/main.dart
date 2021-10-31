import 'package:flutter/material.dart';
import 'package:my_flutter_app/model/bookmark.dart';
import 'package:my_flutter_app/page/bookmarks_page.dart';

import 'widget/bookmark_grid_item_widget.dart';

void main() {
  runApp(MyBookmarksApp());
}

class MyBookmarksApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: BookmarksPage(),
    );
  }
}
