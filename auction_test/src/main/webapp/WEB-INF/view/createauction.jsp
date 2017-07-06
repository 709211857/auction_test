

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css" href="css/personalCenterLeft.css"/>
<link rel="stylesheet" type="text/css" href="css/div.css"/>
<title>Create Auction</title>


</head>

<body>
<style type="text/css">


a:link { text-decoration: none; color:black}
a:hover {text-decoration: none; color:#CF0000}
a:visited { text-decoration: none; color:CF0000}
</style>



<div class="personalCenter">

 <form action="addGoodServlet" method="post" enctype="multipart/form-data" onsubmit="return checkAll();">
<div class="personalCenterRight">
  <p align="center">Create Auction </p>
   
  <table height="302" class="releaseGoodsTable" align="center">
    <tr>
      <td width="158" rowspan="8"><div align="center">
          <table width="200" border="0" height="302"
								style="text-align: right">
            <tr>
              <td>Product Name:</td>
            </tr>
            <tr>
              <td>Product Type:</td>
            </tr>
            <tr>
              <td>Product Price:</td>
            </tr>
            <tr>
              <td>Product Num:</td>
            </tr>
            <tr>
              <td>Product Location:</td>
            </tr>
            <tr>
              <td>Bid Start time:</td>
            </tr>
            <tr>
              <td>Bid End Time:</td>
            </tr>
       
          </table>
      </div>
          <div align="center"></div>
        <div align="center"></div>
        <div align="center" class="STYLE3"></div>
        <div align="center" class="STYLE3"></div>
        <div align="center" class="STYLE3"></div>
        <div align="center"></div></td>
      <td width="240"  ><label>
        <input type="text" id="txtgName" name="txtgName" onblur="checkgName()" /><input type="hidden" name="uId"/>
        </label>
      </td>
      <td width="180"><span id="gName" style="color:red">*</span></td>
     
    </tr>

    <tr>
      <td><label>
       <input type="text" id="txtgPrice" name="txtgPrice" onblur="checkgPrice()" />
        </label>
      </td>
      <td><span id="gPrice" style="color:red">*</span></td>
    </tr>
    
    <tr>
      <td><label>
               <input type="text" id="txtgNum" name="txtgNum" onblur="checkgNum()" />
        </label>
      </td>
      <td><span id="gNum" style="color:red">*</span></td>
    </tr>
    <tr>
      <td><label>
         <input type="text" name="txtgAddress" />
        </label>
      </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><label>
        <input type="text" name="txtgProductDate" onclick="new Calendar().show(this);" readonly="readonly"/>
        </label>
      </td>
      <td>&nbsp;</td>
    </tr>
   <tr>
      <td><label>
         <input type="text" name="txtgAddress" />
        </label>
      </td>
      <td>&nbsp;</td>
    </tr>
    <tr>
      <td><label>
         <input type="text" name="txtgAddress" />
        </label>
      </td>
      <td>&nbsp;</td>
    </tr>
  </table>
  <p align="center" class="STYLE1">
    <label>
    <input type="submit" name="Submit" value="Commit" />
    </label>
  &nbsp;
  <label>
  <input type="reset" name="Submit2" value="Reset" />
  </label>
  </p>
  <p>&nbsp;</p>
   <p align="center"><%=request.getAttribute("msg")!=null?request.getAttribute("msg"):"" %></p>
</div>
</form>
<div id="Spaces"></div>

</div>
</body>

</html>
