import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

import 'bookmark.dart';

class BookmarkListItemWidget extends StatelessWidget {
  Bookmark bookmark;

  BookmarkListItemWidget(this.bookmark);

  @override
  Widget build(BuildContext context) {
    return Padding(
        padding: const EdgeInsets.all(12),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: <Widget>[
            Text(bookmark.title, style: Theme.of(context).textTheme.subtitle1),
            SizedBox(height: 6),
            Text(bookmark.link, style: Theme.of(context).textTheme.subtitle2),
          ],
        ));
  }
}
