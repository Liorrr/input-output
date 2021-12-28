Read from the file you wrote in the output exercise and parse the
data in each line into a 'Book'

**Example:**

file:
```
"Harry Potter"-40.0
"Effective Java"-70.0
```

objects:
```
Book{title='Harry Potter', price=40.0}
Book{title='Effective Java', price=70.0}
```

**Tip**: You must 'parse' each line and separate the values into two strings and then
convert the price into a float using Float.parseFloat(String s)