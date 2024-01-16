#Domain model

###User stories

```
1. When I run the program I see a menu giving me options to use each of the functions of the program.

2. When I select the option it will output a randomly chosen student from the list.

3. When I select the option it will output a list of all of the students as randomly chosen pairs.

4. When I select the option it will output a random list of Peer Groups for all of the students (groups of 4 students).

5. When I run the program it should load the list of current students from a text file.
```

| Class          | Members              | Methods         | Scenarios                        | Results/Output       |
|----------------|----------------------|-----------------|----------------------------------|----------------------|
| StudentMembers | String[] studentList | run()           | Runs the program giving          | Outputs the list     |
|                | Scanner input        |                 | showing the list of students.    | of students, as      |
|                | Random randomizer    |                 | It will also give a prompt       | well as options.     |
|                |                      |                 | asking what the user want to do. |                      |
|                |                      | randomStudent() | When this option is selected,    | Outputs a random     |
|                |                      |                 | the program will select one      | student from the     |
|                |                      |                 | random student from the  list.   | list                 |
|                |                      |                 |                                  |                      |
|                |                      | randomPairs()   | Option that creates random       | Outputs a new list   |
|                |                      |                 | pairs with random students       | with random students |
|                |                      |                 |                                  | in random pairs      |
|                |                      |                 |                                  |                      |
|                |                      | randomGroups()  | Option that is able to create    | Outputs a new list   |
|                |                      |                 | groups of four with random       | containing random    |
|                |                      |                 | students.                        | groups of four       |



```
1. When I run the program a new deck of cards should be created and then they should be shuffled.

2. I should be able to select an option to display the current state of the deck.

3. I should be able to select an option to shuffle the deck.

4. I should be able to select an option to create a hand of cards dealt from the top of the deck, I can specify how many cards should be in it.

5. I should be able to deal out 4 hands of 5 cards each and see the dealt hands.

6. I should be able to view the top card of the deck.

7. I should be able to cut the cards and see a card from an arbitrary point in the deck.
```