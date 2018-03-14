Ch13Ex02: Plural String Resources

The subtitle is not grammatically correct when there is a single crime. 1 crimes just
does not show the right amount of attention to detail for your taste. For this
challenge, correct this subtitle text. You could have two different strings and
determine which one to use in code, but this will quickly fall apart when you
localize your app for different languages. A better option is to use
plural string resources (sometimes also called quantity strings).
First, define a plural string in your strings.xml file.

	<plurals name="subtitle_plural">
		<item quantity="one">%1$d crime</item>
		<item quantity="other">%1$d crimes</item>
	</plurals>

Then, use the getQuantityString method to correctly pluralize the string.

	int crimeSize = crimeLab.getCrimes().size();
	String subtitle = getResources().getQuantityString(R.plurals.subtitle_plural, crimeSize, crimeSize);