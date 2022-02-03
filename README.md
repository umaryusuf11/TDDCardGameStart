# TDDCardGameStart
## Setup
* See if not done from the last lab [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup)
* Fork [TDDCardGameSevensStart](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/tddcardgamestart) see [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup)
* Make sure you have invited Derek Somerville and your tutor as Developer Members
* Check the following links to understand how Snaps and Sevens work
  * [https://en.wikipedia.org/wiki/Snap_(card_game)](https://en.wikipedia.org/wiki/Snap_(card_game))
  * [https://www.wikihow.com/Play-Sevens-(Card-Game)](https://www.wikihow.com/Play-Sevens-(Card-Game))
  * [https://www.youtube.com/watch?v=oYH5-Or5ik0](https://www.youtube.com/watch?v=oYH5-Or5ik0)

## Overview
* You will firstly complete the snap card game. So the user will match when the two cards have either the same suit or face card e.g. ten or ace.
* Secondly you will complete the sevens card game, see details of the game above.
* In both cases you will use test driven development.
  * Create the test first
  * Run the test to fail
  * Commit the test with an appropriate commit message
  * Write the code so the test passes
  * Refactor
  * Commit your code with an appropriate commit message


## Already Done
* The tests for BlackJack have already been completed.

## Snap Tests
* Please write each test and commit your work and leave a comment with the method changed e.g. git commit -m "Completed playToSevenHandCanPlaySevenToEmptyHand"
* Please write the code to pass the test and commit your work
  * isSnapWithSuit - Test if two cards of the same suit e.g. D3 and D4 will return true
  * isNotSnapWithRankAndSnapSuitOn - Test if two cards with the same face will return false e.g. C5 and H5
  * isSnapRank - Test if two cards of the same face will return true. Note the last parameter snapSuitOn will be false
  * isNotSnapWithSuitAndSnapSuitOff - Test if two cards of the same suit return false

## Sevens
* Please work through completing each test that has no code. Commit after the test has been completed and again after the code has been written to pass the test. Leave a comment for the commit.
* canPlayToSevenHandSevenEmpty - Can play a seven of hearts when the hand is empty.
* Continue for the rest of the failing tests.

## Submit
* Before you commit your final solution, double check it can build and all the test you completed can run.
* Go to the Week 5 section and open the assessment
* In text paste the https .git for the forked project
* Zip the project and submit