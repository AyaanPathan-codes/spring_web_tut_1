import "dotenv/config";
import express from "express";
const app = express();

const port = process.env.PORT || 3000;
app.listen(port, () => {
  console.log(`Server is live at ${process.env.PORT}`);
});

app.get("/", (req, res) => {
  res.send("Server is live");
});

app.get("/api/jokes", (req, res) => {
  const jokes = [
    
      {
        id: 1,
        name: "Programmer Joke",
        joke: "Why do programmers prefer dark mode? Because light attracts bugs.",
      },
      {
        id: 2,
        name: "JavaScript Joke",
        joke: "Why did the JavaScript developer go broke? Because he kept using var instead of let.",
      },
      {
        id: 3,
        name: "Backend Joke",
        joke: "Why did the server break up with the database? Too many queries.",
      },
      {
        id: 4,
        name: "Debugging Joke",
        joke: "Debugging is like being the detective in a crime movie where you are also the criminal.",
      },
      {
        id: 5,
        name: "API Joke",
        joke: "I told my API a joke… it returned 404, not found.",
      },
      {
        id: 6,
        name: "Coffee Joke",
        joke: "A programmer’s favorite place is the coffee break point.",
      },
  ];

  res.send(jokes);
});
