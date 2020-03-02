<?php 
	include 'connect/conn.php';
	$mess = '<p class="alert alert-success col-4">Xóa thành công</p>';
	$id = $_GET['id'];
	$sql = "DELETE FROM `loaitin` WHERE id=$id";
	$result =mysqli_query($conn,$sql);
	if ($result) {
		header('location:listLoaiTin.php?mess='.$mess);
	}else {
		echo 'Không thể xóa';
	}
 ?>