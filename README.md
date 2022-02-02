# TDDCardGameStart
## Setup
* To get set up (if you haven't managed that in previous labs already), start here: [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/setup)
* Fork this repo: [TDDCardGameSevensStart](https://stgit.dcs.gla.ac.uk/oose-2021-22-teaching-team/tddcardgamestart)
  * If you need a reminder on how to fork, see [https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup](https://stgit.dcs.gla.ac.uk/DerekSomerville/javagetstarted/-/wikis/home/Git/Project_Setup)
  * Make sure you have invited (by going to Project Information > Members): Derek Somerville, your tutor and your Demonstrator as _Developer_ members.
* [Rules of Snap (card game)](https://en.wikipedia.org/wiki/Snap_(card_game))
* [Rules of Play Sevens (card game)](https://www.wikihow.com/Play-Sevens-(Card-Game))
* Watch this: [https://www.youtube.com/watch?v=oYH5-Or5ik0](https://www.youtube.com/watch?v=oYH5-Or5ik0)

## Overview
* You will first complete the snap card game, so the user will match when the two cards have either the same suit or face card, e.g. ten or ace. Rules are in a link above.
* Secondly you will complete the sevens card game, again see details of the game above.
* In both cases, you will use test driven development.
  * Create the test first
  * Run the test to fail
  * Write the code so the test passes
  * Refactor

## BlackJack
* The tests for BlackJack have already been completed for you, so you can see how the TDD process works.

## Snap Tests
* __First, write each test and commit your work.__
* __Then, write the code to pass the test and commit your work.__
* The tests you should write are as follows:
  * `isSnapWithSuit` - Test if two cards of the same suit e.g. D3 and D4 will return true
  * `isNotSnapWithRankAndSnapSuitOn` - Test if two cards with the same face will return false e.g. C5 and H5
  * `isSnapRank` - Test if two cards of the same face will return true. Note the is last parameter snapSuitOn will be false
  * `isNotSnapWithSuitAndSnapSuitOff` - Test if two cards of the same suit returns false

## Sevens
* Please work through, completing each test that has no code. __Again, you should commit after the test has been completed and then after the code has been written to pass the test.__
* `canPlayToSevenHandSevenEmpty` - Can play a seven of hearts when the hand is empty.
* Continue development to get the failing tests to pass.

## Submit
* Before you commit you final solution, double check it can build and all the test you completed can run.
* Go to the Week four folder and open the assessment
* In text, paste the https .git for the forked project
* Zip the project and submit this file.
