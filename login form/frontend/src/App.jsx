import React,{useState} from 'react';
import axios from "axios";

const App = () => {
  const [email,setEmail] = useState("");
  const [password,setPassword] = useState("");  

  const handleSubmit = async(e) =>{
    e.preventDefault();

    try{
      const res = await axios.post("http://localhost:5000/login",{
        email,
        password,
      });
      alert(res.data.message);
    }
    catch(err){
      console.error(err);
    }
  }

  return (
    <div>

      <form onSubmit={handleSubmit}>
        <input type="text" placeholder='Enter email' value = {email} onChange={(e) => setEmail(e.target.value)}/>
        <input type="text" placeholder='Enter password' value={password} onChange={(e)=>setPassword(e.target.value)} />

        <button type='submit'>Login</button>
      </form>

    </div>
  )
}

export default App