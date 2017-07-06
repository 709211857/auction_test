
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>Bidding</title>

<style type="text/css">
<!--

.STYLE5 {
	font-size: 24px;
	font-weight: bold;
}
-->
</style>


</head>
<body>

	<form action="addBidRecodeServlet" method="post" >
		<table width="1360" border="0" cellpadding="0" cellspacing="0">
			<!--DWLayoutTable-->
			<tr>
				<td width="187" rowspan="3" valign="top">
					<!--DWLayoutEmptyCell-->&nbsp;</td>
				<td height="34" colspan="9" valign="middle" bgcolor="#E3E3E3"><span
					class="STYLE5">Bidding Information</span>
				</td>
				<td width="203">&nbsp;</td>
			</tr>
			<tr>
				<td height="17" colspan="9" valign="top" class="fenlei1"><table
						width="200" border="0" align="center" cellspacing="0">
						<tr>
							<th height="40" nowrap scope="row">Recipients:</th>
							<td><label></label> <input type="text" id="txtoConsignee" name="txtoConsignee"
								value="Austin"></td>
						</tr>
						<tr>
							<th height="37" nowrap scope="row">Tel:</th>
							<td><label> <input type="text" id="txtoConPhone" name="txtoConPhone"
									value="13591716680"> </label></td>
						</tr>
						<tr>
							<th height="37" nowrap scope="row">Delivery Address:</th>
							<td><label> <input type="text" id="txtoConAddr" name="txtoConAddr"
									value="Hi Tech Zone DaLian LiaoNing China"> </label></td>
						</tr>
						<tr>
							<th height="35" nowrap scope="row">PostCode:</th>
							<td><label> <input type="text"
							id="txtoConPostalCode"
									name="txtoConPostalCode"
									value="116011" onblur="checkoConPostalCode()"> </label></td>
						</tr>
						<tr>
							<th height="35" nowrap scope="row">Left Time:</th>
							<td><label> 00'04''</td>
						</tr>
						<tr>
							<th height="23" scope="row">Bid Price:</th>
							<td><label><input type="text" name="bPrice" value=""/></label></td>
						</tr>
						<tr>
							<th height="23" scope="row">Number:</th>
							<td><label><input type="text" name="bNum" value="" onblur="countNum()"> <input type="hidden" name="bgNum" value=""/></label></td>
						</tr>
						<tr>
							<th height="23" scope="row">&nbsp;</th>
							<td><label><input type="submit" value="Confirm"/> <input type="reset" value="Reset"/> </label></td>
						</tr>
					</table>
				</td>
				<td></td>
			</tr>






			<tr>
				<td height="94" colspan="9" valign="top"><br>
				</td>
				<td></td>
			</tr>
			<tr>
				<td height="19">&nbsp;</td>
				<td width="232">&nbsp;</td>
				<td width="91">&nbsp;</td>
				<td width="17">&nbsp;</td>
				<td width="132">&nbsp;</td>
				<td width="141">&nbsp;</td>
				<td width="71">&nbsp;</td>
				<td width="78">&nbsp;</td>
				<td width="128">&nbsp;</td>
				<td width="80">&nbsp;</td>
				<td><br></td>
			</tr>
			<tr>
				<td height="21">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
			<tr>
				<td height="21">&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			</tr>
		</table>
	</form>
</body>
</html>
