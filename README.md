# joop-2nd-si-modelling-practice-Kings-pub

# Currently in beta version

## This is a modelling of the (in)famous pub in Szikszó, the "Kings pub" created in Java. You can virtually visit the establishment and have a great night or if unlucky have a terrible one.

### You arrive to the pub at 18:00. The customers and the barista are generated randomly from a csv file.The barista has a Closeing time field wich determines when does the simulation end. Your goal is to have the most fun you can before the pub closes. There are multiple factors:money,drunkness,happiness and time of course. 

##The current version:
    generates the customers and barista from csv files
    3 customer classes:friendly,neutral,hostile
    it supports creating your own characters
    saving and loading your progress
    navigate through rooms
    minor events(smoking,toilet) are implemented
    happiness and drunkness can be manipulated already just to see,how it will look
    time is being tracked


## Coming in the next version:
    interaction with friendly and neutral customers(funny quotes,lore)
    drinking
    games(pool,foosball)
    evaluation of your result at the end of the simulation
    random events by customers
    UI improvements
    



## `Commands`

    :save  Saves the state of the simulation(Who would've thought?!)
    :create You can create a new customer(INvite a friend to the pub)
    :list List all other customers by location and allegiance
    :find Search customer by name, if he or she is in the pub at the moment.If found return their "stats"
    :exit Close the simulation(It also saves)
    :time Check the current time in the simulation

## `Compilation`
    cd <repo>
    cd src
    javac com/codecool/*.java

## `Execution`
    cd <repo>
    cd src
    java com.codecool.Main