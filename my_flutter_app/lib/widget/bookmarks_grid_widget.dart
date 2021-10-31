import 'package:flutter/cupertino.dart';
import 'package:my_flutter_app/model/bookmark.dart';
import 'package:my_flutter_app/widget/bookmark_list_tile_widget.dart';

import 'bookmark_grid_item_widget.dart';

class BookmarksGridWidget extends StatelessWidget {
  final List<Bookmark> bookmarksList;

  BookmarksGridWidget(this.bookmarksList);

  @override
  Widget build(BuildContext context) {
    return Padding(
        padding: const EdgeInsets.symmetric(horizontal: 6),
        child: GridView.builder(
          itemCount: bookmarksList.length,
          gridDelegate: SliverGridDelegateWithFixedCrossAxisCount(
              childAspectRatio: 1, crossAxisCount: 2, crossAxisSpacing: 4),
          itemBuilder: (BuildContext context, int index) {
            return BookmarkGridItemWidget(bookmarksList[index]);
            // return BookmarkListTileWidget(bookmarksList[index]);
          },
        ));
  }
}
