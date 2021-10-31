import 'package:flutter/cupertino.dart';
import 'package:my_flutter_app/model/bookmark.dart';
import 'package:my_flutter_app/widgent/bookmark_list_tile_widget.dart';

import 'bookmark_list_item_widget.dart';

class BookmarksListWidget extends StatelessWidget {
  final List<Bookmark> bookmarksList;

  BookmarksListWidget(this.bookmarksList);

  @override
  Widget build(BuildContext context) {
    return ListView.builder(
      itemCount: bookmarksList.length,
      itemBuilder: (BuildContext context, int index) {
        return BookmarkListItemWidget(bookmarksList[index]);
        // return BookmarkListTileWidget(bookmarksList[index]);
      },
    );
  }
}
