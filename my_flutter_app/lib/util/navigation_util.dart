import 'package:flutter/material.dart';
import 'package:my_flutter_app/model/bookmark.dart';
import 'package:my_flutter_app/page/add_bookmark_page.dart';
import 'package:my_flutter_app/page/view_bookmark_page.dart';
import 'package:my_flutter_app/widget/bookmarks_grid_widget.dart';

void navigateToViewBookmarkPage(Bookmark bookmark, BuildContext context) {
  Navigator.of(context).push(
      MaterialPageRoute(builder: (context) => ViewBookmarkPage(bookmark)));
}

Future navigateToAddBookmarkPage(BuildContext context) {
  return Navigator.of(context)
      .push(MaterialPageRoute(builder: (context) => AddBookmarkPage()));
}
