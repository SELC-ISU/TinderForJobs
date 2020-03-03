# Webdev: Basics
- [Link to slides](https://docs.google.com/presentation/d/1Tqe-dxEeGROywPqpI6UAMl5tmmzOr2IcZUf8l_BU1Ps/edit?usp=sharing)
## What is web development?
  - When I say web development, what does everyone imagine?  Some might think of programmers
    designing websites, however this is only the tip of the iceberg.  Web development is a lot
    more than just making a web page look nice; but rather a website is the culmination of
    *many* types of software.
  - Since everyone is familiar with it (even your grandmother), frontend development is the
    act of designing what the webpage actually *looks* like.
  - On the other side of the things, backend development is concerned with how the data that
    passes through the website is handled, the system hosting the website, and how the website handles
    different amounts of traffic.
  - It is largely technical compared to the frontend engineer.
  - A backend engineer might be concerned with client / server architecture, how data is
    put into a database, etc.
  - It is also important to realize that you need to specify how that website that you
    just designed is going to be accessed.  In this case, we use things called servers
    which is just a piece of code (and something to run it on) that acts as a “middle
    man” (often called middleware actually) to go from the computer that the website is
    being hosted on to what users see.
## How does this stuff work on a basic level?
    - Basically you run your browser and type some URL in like "youtube.com".
    - URLs are mapped to an IP using a DNS (Domain Name System), which is essentially a table
      that maps different domains to IP addresses.
    - You send informationin in the form of packets that ask for some file from the website.
    - After you ask for the information, by sending a request when you enter that URL, the
      website responds if possible.  These responses are sent through something called HTTP
      (Hypertext Transfer Protocol).  It sends HTML (Hypertext Markup Language) code!
## How is this stuff sent?
    - As I just mentioned, we are sending this through HTTP (Hypertext Transfer Protocol).  As
      a quick aside, any good website will use HTTPS which is HTTP Secure.  It's TLS encrypted
      (used to be SSL but that is a different story).
    - Anyway, we will just refer to it as HTTP, because it's simpler.
    - This information is sent through HTTP, where two sides can communicate and send
      requests.  There are many different types of requests such as: GET, POST, PUT, DELETE,
      etc.
    - They do pretty much what their name suggests.  If a browser is asking for data so that
      it can render it, allowing for a user to see it, then we are sending a GET request.  The
      server will then send a response of some sort.

## HTML
- HTML stands for Hypertext Markup Language (Notice... HYPERTEXT).
- HTML consists of a series of nested elements, where each element is a node in a tree.
- The HTML documents get delivered as text documents, but are then *parsed* and turned into
  the Document Object Model (DOM).  This is a format in which a web browser can display the
  elements.

### Let's write some HTML
- HTML, as I mentioned previously, consists of a series of nested tags of different types.
- Every HTML document has a
- Head tag is obviously for meta information regarding the content.
    - Can also import files in here.
- Body is where all the action happens ;)
    - Here we can d

## CSS
## JavaScript
