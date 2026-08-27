## CSCE 10204: Strings

### toUpperCase() Method

```java
public static String toUpperCase(String str)
```
**Description:** Converts all of the characters in this String to upper case.

**Return Value:** the String, converted to uppercase.

---

### subString() Method

```java
public static String subString(String str, int beginIndex, int endIndex)
```

**Description:** Returns a string that is a substring of this string. The substring begins at the specified beginIndex and extends to the character at index endIndex - 1. Thus the length of the substring is endIndex-beginIndex.

**Parameters:**
beginIndex - the beginning index, inclusive.
endIndex - the ending index, exclusive.
**Return Value:** the specified substring.

---

### toCharArray() Method

```java
public static char[] toCharArray(String str)
```

**Description:** Converts this string to a new character array.
**Return Value:** a newly allocated character array whose length is the length of this string and whose contents are initialized to contain the character sequence represented by this string.

---

### split() Method

```java
public static String[] split(String str, char delim)
```

**Description:** Splits this string around matches of the given delimiter.
**Returns:** The array of strings computed by splitting this string around matches of the given delimiter.
