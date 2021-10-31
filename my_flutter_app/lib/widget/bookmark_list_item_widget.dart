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
    return ListTile(
      title: Text(
        bookmark.title,
        style: Theme.of(context).textTheme.subtitle1,
      ),
      subtitle: Text(
        bookmark.link,
        style: Theme.of(context).textTheme.subtitle2,
      ),
      onTap: () => navigateToViewBookmarkPage(bookmark, context),
    );
  }
}
