# java packages
so you wanna know how packages work...fine:
packages are a way of seperating part of the code (i think)

in the settings.json file.
```json
{
    "java.project.sourcePaths": [
        "ChordlMBals",
    ]
}
```

as you can see the "ChordlMBals"(say it outloud) file is included.
meaning that we don't need the `package stuff.stuff` at the start of a java file inside the folder.
└── ChordlMBals
  └── :).java     // no package stuff.stuff

lets say that we have a file called testing "testing" that is inside of "ChordlMBals"
inside testing we have "someClass.java":
└── ChordlMBals
  ├── :).java     // no package stuff.stuff
  └── testing
    └── someClass.java   // use: package testing


you may ask, huh its pretty simple, why does it error out that much
GREAT QUESTION.
:O

btw its the same with go
btw btw this is all cuz of vscode, we wouldn't have to deal
w that if we were using a compiler, which is probably a good idea
but like fuck it.
