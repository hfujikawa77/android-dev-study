import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:my_flutter_app/page/add_bookmark_page.dart';
import 'package:my_flutter_app/page/view_bookmark_page.dart';
import 'package:my_flutter_app/util/navigation_util.dart';

import '../model/bookmark.dart';

class BookmarkListItemWidget extends StatelessWidget {
  final Bookmark bookmark;

  BookmarkListItemWidget(this.bookmark);

  @override
  Widget build(BuildContext context) {
    return Padding(
      padding: const EdgeInsets.all(12),
      child: InkWell(
        onTap: () => navigateToViewBookmarkPage(bookmark, context),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            Text(bookmark.title, style: Theme.of(context).textTheme.subtitle1),
            SizedBox(height: 6),
            Text(bookmark.link, style: Theme.of(context).textTheme.subtitle2),
          ],
        ),
      ),
    );
  }
}
