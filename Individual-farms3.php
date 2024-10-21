<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
            integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

        <style>
            .header {
                box-sizing: border-box;
                border: 1px solid rgb(38, 122, 39);
                background-color: rgb(68, 182, 56);
                text-align: center;
                margin-top: 3px;
            }

            .yojna-name {
                display: flex;
                margin-left: 20px;
                margin-top: 5px;
            }

            .yojna-name h2 {
                padding: 10px;
            }

            .yojna-name ul {
                text-align: center;
            }

            .header img {
                width: 60px;
                height: 60px;
                margin: 5px;
            }

            .navbar {
                position: sticky;
                height: 60px;
                width: 550px;
                text-align: center;
                box-sizing: border-box;
                margin-left: 200px;
                background-color: rgb(62, 146, 56);
            }

            .nav {
                list-style: none;
                margin-bottom: 5px;
            }

            .nav-link {
                color: white;
                text-decoration: none;
                font-size: 22px;
                margin-bottom: 10px;
                align-content: center;
            }

            .anime {
                box-sizing: border-box;
                margin: 20px;
                background-color: rgb(250, 183, 236);
                height: 55px;
                border-left: 5px solid rgb(182, 67, 157);
                border-right: 5px solid rgb(182, 67, 157);
                border-radius: 10px;
            }

            .anime p {
                margin: 10px;
                font-size: 20px;
            }

            .container1 {
                border: 1px solid black;
                width: 1000px;
                margin: auto;
            }

            .registration {
                justify-content: center;
                text-align: center;
                border: 1px solid rgb(223, 227, 252);
                background-color: rgb(236, 231, 251);
                border-radius: 20px;
                padding: 5px;
            }

            .form {
                height: 1500px;
                margin: auto;
            }

            .ebtn {
                background-color: rgb(236, 236, 250);
                border: 1px solid rgb(185, 185, 246);
            }

            .form-group.required .control-label:after {
                content: "*";
                color: red;
            }

            .line {
                border: 2px solid rgb(136, 136, 246);
                border-radius: 20px;
            }

            .question {
                margin: 20px;
            }

            .form-check {
                margin: 10px;
            }

            .btn {
                font-size: 20px;
                margin: auto;
                align-items: center;
            }

            .file {
                margin: 20px;
            }

            .input-file {
                margin: 10px;
            }

            .farm-info {
                border: 1px solid rgb(246, 246, 248);
                background-color: rgb(250, 250, 253);
            }

            .aadhar-info {
                margin-top: 20px;
                border: 1px solid rgb(246, 246, 248);
                background-color: rgb(250, 250, 253);
            }

            .input-file2 {
                margin-top: 5px;
            }

            .aadhar {
                margin: 5px;
            }

            .caste-info {
                margin-top: 20px;
                border: 1px solid rgb(246, 246, 248);
                background-color: rgb(250, 250, 253);
            }

            .domicile-info {
                margin-top: 20px;
                border: 1px solid rgb(246, 246, 248);
                background-color: rgb(250, 250, 253);
            }

            .bank-info {
                margin-top: 20px;
                border: 1px solid rgb(246, 246, 248);
                background-color: rgb(250, 250, 253);
            }

            .brk {
                border: 1px solid rgb(193, 193, 246);
            }

            .agreement {
                font-size: 18px;
                padding: 15px;
            }

            #back {
                float: left;
            }

            #continue {
                float: right;
            }

            .footer {
                margin: 5px;
                margin-top: 30px;
            }
        </style>
    </head>

    <body>
        <header class="header">
            <div class="yojna-name">
                <img src="./img/logo1.png" alt="Logo">
                <h2 style="font-family: 'Times New Roman', Times, serif;">Gram Vikas Yojna</h2>

                <div class="navbar">
                    <section class="nav">
                        <a class="nav-link active" aria-current="page" href="/Welcome.html">Home</a>
                        <a class="nav-link" href="/login.html">Login</a>
                        <a class="nav-link" href="/Registration.html">Registration</a>
                        <a class="nav-link" href="/Welcome.html">About Us</a>
                    </section>
                </div>
            </div>
        </header>
        <div class="anime">
            <marquee behavior="" direction="" width="100%" scrolldelay="1sec">
                <p>Mahatma Gandhi National Rular Employment Guarantee Scheme (Individual Farms).</p>
            </marquee>
        </div>

        <div class="container1">
            <div class="container mt-4">
                <div class="registration">
                    <h3>Personal Information</h3>
                </div>
                <hr class="line">
                <div class="form">
                    <form enctype="multipart/form-data" method="POST" action="submit_form.php" class="formm">
                        <!-- Farm Info -->
                        <div class="farm-info">
                            <button type="button" class="btn btn-outline-secondary ebtn">Farm Details</button>
                            <hr class="brk">
                            <div class="form-row">
                                <div class="form-group required col-md-6">
                                    <label for="City" class="control-label">Village</label>
                                    <input type="text" class="form-control" name="village" id="City" placeholder="Enter City">
                                </div>
                                <div class="form-group required col-md-6">
                                    <label for="GroupNo" class="control-label">Group No</label>
                                    <input type="text" class="form-control" name="gname" id="GroupNo" placeholder="Enter Group No">
                                </div>
                                <div class="form-group required col-md-6">
                                    <label for="inputPassword4" class="control-label">Total Farm Area</label>
                                    <input type="area" class="form-control" name="area" id="farmarea" placeholder="Enter Total Farm Area">
                                </div>
                            </div>
                            <div class="form-row">
                                <label for="" class="question">Are you benified before ?</label>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="inline" id="inlineRadio1" value="option1">
                                    <label class="form-check-label" for="inlineRadio1">Yes</label>
                                </div>
                                <div class="form-check form-check-inline">
                                    <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">
                                    <label class="form-check-label" for="inlineRadio2">No</label>
                                </div>
                                <div class="file">
                                    <input type="file" name="benified_file" class="input-file">
                                </div>
                            </div>
                        </div>

                        <!-- Addhar Info -->
                        <div class="aadhar-info">
                            <button type="button" class="btn btn-outline-secondary ebtn">Aadhar Details</button>
                            <hr class="brk">
                            <div class="form-row">
                                <div class="form-group required col-md-6">
                                    <label for="aadharnumber" class="control-label">Aadhar Number</label>
                                    <input type="text" class="form-control" name= "adhar" id="aadharnumber" placeholder="Aadhar Number">
                                </div>
                            </div>

                            <div class="form-group required form-row">
                                <label for="aadharnumber" class="control-label aadhar">Upload Your Aadhar Card</label>
                                <div class="file2">
                                    <input type="file" name="adhar_file" class="input-file2">
                                </div>
                            </div>
                        </div>

                        <!-- Caste Info -->
                        <div class="caste-info">
                            <button type="button" class="btn btn-outline-secondary ebtn">Caste Details</button>
                            <hr class="brk">
                            <div class="form-row">
                                <div class="form-group required col-md-6">
                                    <label for="userName" class="control-label">User Name</label>
                                    <input type="text" class="form-control" name="username" id="userName" placeholder="Enter your name">
                                </div>
                                <div class="form-group required col-md-6">
                                    <label for="crNo" class="control-label">Certificate No</label>
                                    <input type="text" class="form-control" name="certno" id="crNo"
                                        placeholder="Enter caste certificate no">
                                </div>
                            </div>
                            <div class="form-group required form-row">
                                <label for="castnumber" class="control-label aadhar">Upload Your Caste Certificate</label>
                                <div class="file3">
                                    <input type="file" name="cast_certfile" class="input-file2">
                                </div>
                            </div>
                        </div>

                        <!-- Domicile Info -->
                        <div class="domicile-info">
                            <button type="button" class="btn btn-outline-secondary ebtn">Domicile Details</button>
                            <hr class="brk">
                            <div class="form-row">
                                <div class="form-group required col-md-6">
                                    <label for="userName" class="control-label">User Name</label>
                                    <input type="text" class="form-control" name="uname" id="userName" placeholder="Enter your name">
                                </div>
                                <div class="form-group required col-md-6">
                                    <label for="crNo" class="control-label">Certificate No</label>
                                    <input type="text" class="form-control" name="crno" id="crNo"
                                        placeholder="Enter domicile certificate no">
                                </div>
                            </div>
                            <div class="form-group required form-row">
                                <label for="aadharnumber" class="control-label aadhar">Upload Your Domicile
                                    Certificate</label>
                                <div class="file3">
                                    <input type="file" name="domicile_cert" class="input-file2">
                                </div>
                            </div>
                        </div>

                        <!-- Bank Details Info -->
                        <div class="bank-info">
                            <button type="button" class="btn btn-outline-secondary ebtn">Bank Details</button>
                            <hr class="brk">
                            <div class="form-row">
                                <div class="form-group required col-md-4">
                                    <label for="accNo" class="control-label">Account Number</label>
                                    <input type="text" class="form-control" name="accno" id="accNo"
                                        placeholder="Enter your account Number">
                                </div>
                                <div class="form-group required col-md-3">
                                    <label for="IFSC" class="control-label">IFSC Code</label>
                                    <input type="text" class="form-control" name="ifsc" id="IFSC" placeholder="Enter IFSC code">
                                </div>
                                <div class="form-group required col-md-5">
                                    <label for="branchname" class="control-label">Branch Nsme</label>
                                    <input type="text" class="form-control" name="branch" id="branch" placeholder="Enter branch name">
                                </div>
                            </div>
                            <div class="form-group required form-row">
                                <label for="aadharnumber" class="control-label aadhar">Upload Your Passbook</label>
                                <div class="file3">
                                    <input type="file" name="passbook_file" class="input-file2">
                                </div>
                            </div>
                        </div>
                        <hr>

                        <!-- Terms and Conditions Checkbox  -->
                        <div class="form-group agreement">
                            <div class="form-check">
                                <input class="form-check-input" type="checkbox" id="gridCheck">
                                <label class="form-check-label agreement-statement" for="gridCheck">
                                    As I registered as a Laborer under this scheme. I am willing to work with my family. If
                                    the farms are sactioned to me under this scheme, my farmland will be fully Horticulture.
                                </label>
                            </div>
                        </div>
                        
                        <!-- Previous file data -->
                        <input type="hidden" name="name" value="<?= $_GET['Name']?>">
                        <input type="hidden" name="email" value="<?= $_GET['email'] ?>">
                        <input type="hidden" name="phone" value="<?= $_GET['phone'] ?>">
                        <input type="hidden" name="address" value="<?= $_GET['address'] ?>">
                        <input type="hidden" name="city" value="<?= $_GET['city'] ?>">
                        <input type="hidden" name="pin" value="<?= $_GET['pin'] ?>">
                        <input type="hidden" name="state" value="<?= "maharashtra" ?>">
                        <input type="hidden" name="gender" value="<?= $_GET['gender'] ?>">
                        <input type="hidden" name="age" value="<?= $_GET['age'] ?>">

                        <!-- Go-Back and Submit Button -->
                        <div class="buttons">
                            <a href="./Individual-farms2.php" class="btn btn-primary">Back</a>
                            <input type="submit" name="submit" value="Send" class="btn btn-primary" >
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        <!-- Footer -->
        <footer class="footer">
            <hr>
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <div class="copyright">
                            <p>© <span>2022</span> <a href="#" class="transition">@Vaishnavi</a> All rights reserved.</p>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
    </body>
</html>

<!-- 
<script>
    $( "#target" ).click(function() {
        alert( "Handler for .click() called." );
    });
</script> -->