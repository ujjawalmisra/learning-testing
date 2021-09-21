

**CSS**

**BASICS**

**What is CSS ?**

CSS (Cascading Style Sheets) is the code that styles web content.

Example :

p {

color: red;

}

**Anatomy of CSS Ruleset**

CSS

1





**CSS - most common selectors**

**Type, Class and ID selectors**

**Type selector :**

CSS

2





span {

background-color: yellow;

}

**Universal selector :**

\* {

margin: 0;

}

**Class selectors :**

.highlight {

background-color: yellow;

}

**ID selectors :**

#one {

background-color: yellow;

}

**DOM tree**

CSS

3





**Locator strategies supported in selenium webdriver**

**Selenium locator strategies**

Description

Locator

[class](https://www.notion.so/class-name-9674d7348caf4057bf78011000a54232)

[name](https://www.notion.so/class-name-9674d7348caf4057bf78011000a54232)

Locates elements whose class name contains the search value (compound class

names are not permitted)

[css](https://www.notion.so/css-selector-e678787fc1de4e29b9f8c4406f774a0e)

Locates elements matching a CSS selector

[selector](https://www.notion.so/css-selector-e678787fc1de4e29b9f8c4406f774a0e)

[id](https://www.notion.so/id-e963dd57366345b6a2357328aab6bb0d)

Locates elements whose ID attribute matches the search value

Locates elements whose NAME attribute matches the search value

[name](https://www.notion.so/name-bc79588660684035939ba0cf7e6a5283)

[link](https://www.notion.so/link-text-5d4cb8bff3ba4f6c95d223b505979ca0)[ ](https://www.notion.so/link-text-5d4cb8bff3ba4f6c95d223b505979ca0)[text](https://www.notion.so/link-text-5d4cb8bff3ba4f6c95d223b505979ca0)[ ](https://www.notion.so/link-text-5d4cb8bff3ba4f6c95d223b505979ca0)Locates anchor elements whose visible text matches the search value

[partial](https://www.notion.so/partial-link-text-1c03e3f8ff674019b5b67d7bad7759a5)[ ](https://www.notion.so/partial-link-text-1c03e3f8ff674019b5b67d7bad7759a5)Locates anchor elements whose visible text contains the search value. If multiple

[link](https://www.notion.so/partial-link-text-1c03e3f8ff674019b5b67d7bad7759a5)[ ](https://www.notion.so/partial-link-text-1c03e3f8ff674019b5b67d7bad7759a5)[text](https://www.notion.so/partial-link-text-1c03e3f8ff674019b5b67d7bad7759a5)[ ](https://www.notion.so/partial-link-text-1c03e3f8ff674019b5b67d7bad7759a5)elements are matching, only the first one will be selected.

[tag](https://www.notion.so/tag-name-47e1ecb861ef4deb888c9804db066b07)

Locates elements whose tag name matches the search value

Locates elements matching an XPath expression

[name](https://www.notion.so/tag-name-47e1ecb861ef4deb888c9804db066b07)

[xpath](https://www.notion.so/xpath-df9f90cd636c4d27993ffc998a24ad01)

Example :

WebElement cheese = driver.findElement(By.id("cheese"));

CSS

4





WebElement cheese = driver.findElement(By.cssSelector("#cheese #cheddar"));

CSS

5

