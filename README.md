The idea of this project stems from a need to convert a language based query like say "what is the revenue per product?" to a machine based query like "select sum(revenue) from sale group by product" .

Given a context , a body of text or a table containing data and a language based query the question that needs addressing is can we make computer solve this question? To make a computer solve the question we first need to convert a common language question into a machine based question. That brings the idea of a converter to light.

we delve into standard sentence forms and experiment with a limited grammer rules and a given set of domain objects as a pilot.

some of the initial questions we seek to handle are as follows

    What is per product sale?
    what is sale per period?
    what is aggregate sale per period per product?
    which product has the highest aggregate sale per period?
    which is the hottest product ?
