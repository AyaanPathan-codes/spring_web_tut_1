
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Stats from "./pages/Stats";
import AddExpense from "./pages/AddExpense";
import Analytics from "./pages/Analytics";
import AddSavings from "./pages/AddSavings";

const App = () => {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Analytics />} />
        <Route path="/stats" element={<Stats />} />
        <Route path="/add" element={<AddExpense />} />
        <Route path="/add-savings" element={<AddSavings />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App