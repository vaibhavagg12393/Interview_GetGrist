Coding Challenge
================

A coding exercise was given to me when I applied for a *Software Engineer* role with [Grist Labs](http://www.getgrist.com/)

##Exercise

You are given a 2-dimensional grid of integers, like the example below. Consider the possible paths through the numbers, from the upper-left to the lower-right corner, that only move down or to the right. The value of a path is the sum of all the numbers that it visits. The goal is to find the path with the greatest value. If there is a tie, any one of such paths would do.

<table>
  <tbody>
    <tr>
      <td>0</td>
      <td>5</td>
      <td>0</td>
      <td>8</td>
      <td>1</td>
      <td>8</td>
    </tr>
    <tr>
      <td>3</td>
      <td>6</td>
      <td>1</td>
      <td>3</td>
      <td>6</td>
      <td>3</td>
    </tr>
    <tr>
      <td>9</td>
      <td>5</td>
      <td>7</td>
      <td>9</td>
      <td>1</td>
      <td>1</td>
    </tr>
    <tr>
      <td>8</td>
      <td>7</td>
      <td>9</td>
      <td>4</td>
      <td>8</td>
      <td>3</td>
    </tr>
    <tr>
      <td>7</td>
      <td>8</td>
      <td>7</td>
      <td>6</td>
      <td>2</td>
      <td>5</td>
    </tr>
    <tr>
      <td>3</td>
      <td>4</td>
      <td>0</td>
      <td>5</td>
      <td>0</td>
      <td>4</td>
    </tr>
  </tbody>
</table>

The specific grid for you to solve is given as a rectangular array of arrays in JSON format. The top-left corner is `array[0][0]`. You are to write a program, in a language of your choice, which finds a path with the largest sum, and outputs it as a string of characters: `R` for a step to the right, and `D` for a step down. Your program should also output the path's value.

For example, the sample above is available as [JSON here](https://github.com/vaibhavagg12393/Interview_GetGrist/blob/master/data/sample1.json), and a correct solution to it is the highlighted path `DDDRRDRRRD`, with the value of `60`.

Here is the specific [challenge to solve](https://github.com/vaibhavagg12393/Interview_GetGrist/blob/master/data/sample2.json).

## Configuration

Fork this project in your GitHub account, then clone your repository:

  Run the following query on terminal.
  ```
  git clone http://github.com/vaibhavagg12393/Interview_GetGrist.git
  ```
  
Instructions to import java-json.jar file to Eclipse
  
   A.) Download the ZIP file from this ['URL'](http://www.java2s.com/Code/JarDownload/java/java-json.jar.zip) and extract it to get the Jar in the cloned directory.<br>
       
   B.) Add the Jar to your build path.<br><br>
  	   To Add this Jar to your build path, follow these steps:
  	   
```
        Right click the Project > Build Path > Configure build path > Select Libraries tab > 
        Click Add External Libraries > Select the Jar file Download
       
```
        
   C.) Compile and run the code in any IDE ( I used Eclipse)<br>
   
##Execution

To execute this exercise, first add the JSON library to the build path, then compile and run GetGrist.java in any IDE ( I used Eclipse)

###Output

```
60
DDDRRDRRRD

```

**Note** the above execution implements the supplied input file from the [`data/`](https://github.com/vaibhavagg12393/Interview_GetGrist/blob/master/data/sample1.json) subdirectory.
