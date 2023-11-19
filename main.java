TextView tv = (TextView)findViewById(R.id.textViewOne);
tv.setTypeface(null, Typeface.BOLD_ITALIC);
// OR
tv.setTypeface(null, Typeface.BOLD|Typeface.ITALIC);
// OR
tv.setTypeface(null, Typeface.BOLD);
// OR
tv.setTypeface(null, Typeface.ITALIC);
// AND
tv.setPaintFlags(tv.getPaintFlags()|Paint.UNDERLINE_TEXT_FLAG);
