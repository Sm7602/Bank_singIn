<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Bank Account Holder Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background: pink;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .form-container {
            background: #ffffff;
            padding: 25px;
            width: 400px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #2c3e50;
        }

        label {
            display: block;
            margin-top: 10px;
            font-weight: bold;
        }

        input, select, textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        textarea {
            resize: none;
        }

        .gender {
            margin-top: 5px;
        }

        .gender input {
            width: auto;
            margin-right: 5px;
        }

        button {
            margin-top: 20px;
            width: 100%;
            padding: 10px;
            background: #2ecc71;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 4px;
            cursor: pointer;
        }

        button:hover {
            background: #27ae60;
        }
    </style>
</head>
<body>

<div class="form-container">
    <h2>Bank Account Holder Form</h2>

    <form action="${pageContext.request.contextPath}/saveAcHolder"
		method="post">
        <label>Full Name</label>
        <input type="text"  name="name" id="name" placeholder="Enter full name" required>

        <label>Date of Birth</label>
        <input type="date" name="dob"  id="dob" required>

        <label>Gender</label>
        <div class="gender">
             <input type="radio" name="gender" id="gender_male" value="Male"> Male
            <input type="radio" name="gender" id="gender_female" value="Female"> Female
          <input type="radio" name="gender" id="gender_other" value="Other"> Other
        </div>

        <label>Account Number</label>
        <input type="text" name="acno"  id="acno" placeholder="Enter account number" required>

        <label>Account Type</label>
       <select name="acType" id="acType">
    <option value="">-- Select Account Type --</option>
    <option value="Savings">Savings</option>
    <option value="Current">Current</option>
    <option value="Fixed Deposit">Fixed Deposit</option>
   </select>

        <label>IFSC Code</label>
        <input type="text" name="IFSC_code"  id="ISFC_code" placeholder="Enter IFSC code" required>

        <label>Mobile Number</label>
        <input type="tel" name="phno"  id="phno" placeholder="Enter mobile number" required>

        <label>Address</label>
        <textarea rows="3" name="address"  id="address" placeholder="Enter address"></textarea>

        <button type="submit">Submit</button>
    </form>
</div>

</body>
</html>
