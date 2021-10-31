import 'package:flutter/material.dart';
import 'package:my_flutter_app/model/bookmark.dart';
import 'package:my_flutter_app/widgent/bookmarks_grid_widgent.dart';
import 'package:my_flutter_app/widgent/view_web_page_widget.dart';

import 'package:webview_flutter/webview_flutter.dart';

class ViewBookmarkPage extends StatelessWidget {
  Bookmark bookmark;
  ViewBookmarkPage(this.bookmark);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: Text(bookmark.title)),
      body: ViewWebPageWidget(bookmark.link),
    );
  }
}

