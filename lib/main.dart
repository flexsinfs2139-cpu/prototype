import 'package:flutter/material.dart';

void main() {
  runApp(const PrototypeApp());
}

class PrototypeApp extends StatelessWidget {
  const PrototypeApp({super.key});

  
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: .fromSeed(seedColor: Colors.deepPurple),
      ),
      home: Scaffold(
        appBar: AppBar(title: const Text('Prototype')),
        body: const Center(child: Text('Hello World!!')),
      ),
    );
  }
}