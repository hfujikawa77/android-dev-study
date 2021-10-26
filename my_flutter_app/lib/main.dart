import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';
import 'package:flutter/cupertino.dart';

void main() {
  // runApp(FlutterLogo());
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
//      return MaterialApp(home: FlutterLogo());
//     return CupertinoActivityIndicator();
    return MaterialApp(
      title: "フラッターのデモ（タイトル）",
      theme: ThemeData(
        primaryColor: Colors.red,
      ),
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return _MyHomePageState();
  }
}

class _MyHomePageState extends State<MyHomePage> {
  int _counter = 0;

  void _incrementCounter() {
    setState(() {
      _counter++;
    });
    print("加算！ counter="+_counter.toString());
  }

  void _decrementCounter() {
    setState(() {
      _counter--;
    });
    print("減算！ counter="+_counter.toString());
  }

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    return Scaffold(
      floatingActionButton: Row(
        mainAxisAlignment: MainAxisAlignment.end,
        children: <Widget>[
          FloatingActionButton(
            child: Icon(Icons.add),
            tooltip: "加算しますよ！",
            onPressed: _incrementCounter,
          ),
          SizedBox(width: 12.0),
          FloatingActionButton(
            child: Icon(Icons.remove),
            tooltip: "減算しますよ！",
            onPressed: _decrementCounter,
          ),
        ],
      ),
      appBar: AppBar(
        title: Text("フラッターのデモのホームページ"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Text(
              "あなたはボタンを押しました。回数は…",
            ),
            Text(
              "$_counter",
              style: Theme.of(context).textTheme.headline1,
            ),
            IconButton(onPressed: null, icon: Icon(Icons.star)),
          ],
        ),
      ),
    );
  }
}
