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
      debugShowCheckedModeBanner: false,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        fontFamily: 'Saira',
      ),
      home: Scaffold(
        appBar: AppBar(
          title: Row(
            mainAxisSize: MainAxisSize.min,
            children: [
              Image.asset('assets/images/logo.png', height: 28),
              const SizedBox(width: 8),
              const Text('Prototype'),
            ],
          ),
        ),
        body: Center(
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              Image.asset('assets/images/logo.png', height: 120),
              const SizedBox(height: 16),
              const Text('Hello World!!'),
            ],
          ),
        ),
      ),
    );
  }
}
