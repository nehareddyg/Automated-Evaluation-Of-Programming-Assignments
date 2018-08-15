# Automated-Evaluation-Of-Programming-Assignments

MOOCs and online learning platforms are changing the way we
impart education and gain knowledge. The courses offered, especially
those related to programming, require students to submit code for a
problem. In this project, we explore how to automate this whole process, i.e,
identifying right submissions and grading the incorrect ones appropri-
ately.

The problem statement is as follows:

Given a set of solutions submitted by students (denote by S), identify the correct ones and grade the
submissions appropriately. We can decompose our problem into the following
subproblems:

1. Given a set of submitted programs and a correct solution, identify the
correct solutions from submitted answers (submissions i.e. S). Test
cases that can discriminate wrong submissions from the correct ones
need to be generated. And then all submissions need to be tested
against these test cases to find out which are the correct submissions
(denote by S correct ) and the incorrect ones (denote by S incorrect ).
2. As every student has her own programming style, S might contain
different approaches to solve the same question. Given the correct so-
lutions (S correct ), find what are the unique approaches used by students
to tackle the question correctly. We will call these unique approaches
as GOLD STANDARDS (S gold−standard ).
Given S gold−standard , and a submission from S incorrect , find out which
approach student was trying to follow. We require to find a tuple
(P, G) where P ∈ S incorrect and G ∈ S gold−standard is the approach that
P is closest to.
3. Given a pair of submitted solution and the corresponding gold standard
(P, G), find the least number of steps to convert G to P using program
repair techniques and assign appropriate scores.

We have worked on Step 2 and our proposed solution is based on identifying similar programs by comparing their Program Dependence Graphs (PDG).

Our work is motivated by [GPLAG paper](http://dx.doi.org/10.1145/1150402.1150522)



Refer to the file [report.pdf](https://github.com/nehareddyg/Automated-Evaluation-Of-Programming-Assignments/blob/master/report.pdf) for more details. Please find the code files in the directory "code/gamma-isomorphism/"

Contributors:
Neha Gaddam(nehareddyg),
Meghana Kotagiri(meghanakotagiri)
