Ch14Ex01: Deleting Crimes

If you added a Delete Crime action item earlier, this challenge builds off of that
by adding the ability to delete crimes from your database by calling a
deleteCrime(Crime) method on CrimeLab, which will call mDatabase.delete(…) to finish
the job. And if you do not have a Delete Crime? Well, go ahead and add it! Add an action
item to CrimeFragment’s toolbar that calls CrimeLab.deleteCrime(Crime) and finish()es its Activity.