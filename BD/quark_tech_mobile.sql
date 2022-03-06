-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-03-2022 a las 21:31:09
-- Versión del servidor: 10.4.22-MariaDB
-- Versión de PHP: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `quark_tech_mobile`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `client`
--

CREATE TABLE `client` (
  `id_client` int(11) NOT NULL,
  `name_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telephone_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `cedula_client` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction_client` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `direction_tienda` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de clientes';

--
-- Volcado de datos para la tabla `client`
--

INSERT INTO `client` (`id_client`, `name_client`, `telephone_client`, `cedula_client`, `direction_client`, `direction_tienda`, `registered_by`, `last_modification`) VALUES
(1, 'Lucia Ramos', '0487554489', '10888777', 'VALLES DEL TUY', 'Caricuao', 'System', ''),
(2, 'Salvador Soriano', '0487554489', '548654654', 'asddddd', 'City Market', 'System', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `name_user` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telephone` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `direction` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `type_account` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registered_by` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `last_modification` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `status` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para el registro de usuarios.';

--
-- Volcado de datos para la tabla `user`
--

INSERT INTO `user` (`id_user`, `name_user`, `username`, `password`, `telephone`, `direction`, `type_account`, `registered_by`, `last_modification`, `status`) VALUES
(1, 'Neifer Reverón', 'NeiferJesus14', '12345', '04142144684', 'Caricuao', 'Moderador', 'System', 'Erika1219', 'Activo'),
(2, 'Erika Castellano', 'Erika1219', 'erika1219', '0412568963', 'Caricuao', 'Vendedor', 'Username', 'NeiferJesus14', 'Activo'),
(5, 'Nery La Malandra', 'nenalamalandra', '12345', '54666546465', 'Caricuao', 'Administrador', 'NeiferJesus14', 'Erika1219', 'Activo'),
(7, 'Keiver Barrio', 'keiver1219', 'keiver1219', '065423514654', 'City Market', 'Vendedor', 'Erika1219', 'NeiferJesus14', 'Activo');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `client`
--
ALTER TABLE `client`
  ADD PRIMARY KEY (`id_client`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `client`
--
ALTER TABLE `client`
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
