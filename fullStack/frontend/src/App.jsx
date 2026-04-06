import { useState } from "react";
import Header from "../src/components/Header.jsx";
const App = () => {
  const [count, setCount] = useState(0);
  function updateCount(){
    setCount(count+1);
  }

  return (
    <div>
      <h1>count is {count}</h1>
      <button onClick={()=>updateCount()}>Updated Count</button>

      <Header count1 = {count}  />
    </div>
  );
};

export default App;
